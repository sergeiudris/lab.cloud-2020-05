
- decentralized dynamic cloud
  - machines join the cloud dynamically
  - discovery starts with a list
  - public domains (e.g. github repos) are used in lookupd/dns like manner
  - machines read/write to those lists
  - encryption/repo write access
    - keys/access data are encapsulated within containers during built time
    - e.g. every release has its keys
  - machines contantly exhange lists, sync other data
  - data in the cloud is persisted on the mahcines, but possibly  public domains are used for backup
  - if all mahcines in the cloud go offline, once online, the cloud continues - since lookup lists are stored on public domains
  - so the principle is that of the internet: name servers (= public lists) to get info needed to find other machines
  - db is replicated within the cloud
    - e.g. there are one hundred million machines
    - obviously, it is not practical to have such a list or for data to be distributed equally
    - instead, say every 100 machines have a full db set
    - machines maintain list of say 100 such db-sets (so of 100x100 machines in total)
    - once a machine queries say all events(tournaments) in the cloud, it uses queries those sets
    - it is only availability and partition tolerance, but not consitency (latest data), as data needs to be synced
  - game
    - players within the game exchange data peer-to-peer
    - to observe, machine (using lists) finds the adresses of machines that are in the game and joins the exchange
    - once game is finished it is persisted to distributed db and (with a possible delay) can be queried accross the cloud
    - same for creation of an event etc.
  - a cloud is installed onto a machine, systems are installed into the cloud like to AWS: cloud provides apis 
  - cloud browser is like an editor/browser: systems' clients are installed like extensions; or same as in unix OS, when you add a repo url and install an app
  - a cloud browser can also act as a browser for standard domains
  - a cloud machine chooses what distributions (systems) to host
  - the in the cloud browser (which can be run on its own) one can select e.g. 'github.com/event-games' app (the app will provide ui for that system)

- centralized dynamic cloud
  - machines add themselves automatically (via bot install) to e.g. k8 cluster
  - consider non-browser client (to exclude domain, https issues)
  - k8
    - https://kubernetes.io/docs/tasks/administer-cluster/cluster-management/#resizing-a-cluster
    - https://kubernetes.io/docs/concepts/architecture/nodes/#self-registration-of-nodes

- research
  - dynamically add machines to k8 cluster
  - decentralized k8 cluster
  

- in theory: 
  - dynamic list of master nodes
    - cluster optimal state implies e.g. not less than 10 master nodes and no more than 10% of total
    - a job runs in the cluster that whenever the master nodes change, pushes updated list of master nodes to github repo
    - this way, the list of master nodes is always quite short and can be obtained by the client
    - all requests from clients go to master nodes
    - cluster should pick nodes to be master based on machine's resources (more cpu/memory)
  - domain
    - a job in the cluster may continuosly update the list of addresses at domain provider (e.g. via AWS api or smth)
    - this way client always requests abc.com, but requests are handled by current master nodes (which by design may always change)

- cluster installation
  - prerequisite for agent installation is docker/k8s
  - this way a node may host multiple systems and installation is OS-agnostic
  - agent and node should be installed as container

- developing cluster
  - nodes run in containers
  - develop using localhost and HA-cluster of container nodes (same node containers  can be run on other machines as well)
  - use localost browser ui, should be same as using sub.domain.io
  - if it's possible, consider installing cluster certificates dynamically using ?extension (it would allow https requests to control nodes)

- master nodes
  - cluster auto handles master node promotion/demotion
  - there can be from 1 up to 7 master nodes
    - https://docs.docker.com/engine/swarm/how-swarm-mode-works/nodes/
  - what's important: at any point in time master has at least 1 master node

- cluster spec/config
  - clsuter spec/config should be in files, version controled

- cluster growth/shrinkage
  - cluster can originate, grow from one to many nodes and shrink back to one node
  - when node image starts, it either joins the cluster or originates a clsuter
  - when a new node join the cluster, current control nodes check if new node has better characteristics to be a control node
  - if conditions are met, one of the control nodes is demoted and new noted is promoted

- controlling the cluster
  - certain (e.g. cluster control) operations require security keys
  - keys are stored in a private repo and used during image builds
  - once origin image is built, cluster can be stared (originate) anywhere (at any node) using the origin image

- node image
  - node image is docker-in-docker
  - once mounted, it swarm inits
  - it starts an agent process (maybe in swarm or maybe direclty in docker)
  - agent process performs ops to find out if cluster exists and either starts or joins the cluster
  - all that happens inside the docker-in-docker node image, reource limits can be specified

- distributed database
  - db node can be added to every node
  - once added, it connects to db cluster within the system cluster
  - data is replicated and distributed (at first, replicated on every node)
  - data can be peristed on host via docker volume



