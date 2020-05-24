
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

- research
  - dynamically add machines to k8 cluster
  - decentralized k8 cluster
  