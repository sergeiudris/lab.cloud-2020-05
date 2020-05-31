- oauth
  - https://en.wikipedia.org/wiki/OAuth
  - https://oauth.net/2/
  - https://aaronparecki.com/oauth-2-simplified/
  - https://github.com/dexidp/dex
    - an example https://github.com/fydrah/loginapp
  - https://github.com/ory
    - https://www.ory.sh/docs/ecosystem/projects
    - https://github.com/ory/hydra
      - https://www.ory.sh/hydra/docs/oauth2/#authenticating-users-and-requesting-consent
    - https://github.com/ory/kratos
      - https://www.ory.sh/kratos/docs/concepts/index/
      - example (works) 
        - https://www.ory.sh/kratos/docs/quickstart/
        - https://github.com/ory/kratos-selfservice-ui-node/tree/v0.1.1-alpha.1
      - "Each identity has one or more credentials associated with it" - indeed
        - https://www.ory.sh/kratos/docs/concepts/credentials
      - run jobs aftr login 
        - https://www.ory.sh/kratos/docs/self-service/flows/user-login-user-registration#executing-jobs-after-user-login
        - possibly, for updating central db user data (to decouple from iam's internal db)
    - https://github.com/ory/oathkeeper
      - https://www.ory.sh/oathkeeper/docs/pipeline/index
    - https://github.com/ory/keto
  - traefik related examples
    - https://github.com/thomseddon/traefik-forward-auth
  - https://github.com/go-authboss/authboss
    - https://github.com/volatiletech/authboss-sample
  - https://github.com/keycloak/keycloak
    - https://www.keycloak.org/docs/latest/securing_apps/index.html


- jre/jdk
  - lightweight jre images
    - https://stackoverflow.com/questions/53669151/java-11-application-as-lightweight-docker-image
    - https://stackoverflow.com/questions/53669151/java-11-application-as-lightweight-docker-image/57145029#57145029
  - https://hub.docker.com/_/openjdk
    - https://github.com/docker-library/docs/blob/master/openjdk/README.md#supported-tags-and-respective-dockerfile-links
  - perf experiences
    - https://stackoverflow.com/questions/22358071/differences-between-oracle-jdk-and-openjdk
    - https://technology.amis.nl/2018/11/23/comparing-jvm-performance-zulu-openjdk-openjdk-oracle-jdk-graalvm-ce/
    - http://sparkjava.com/
      - https://github.com/perwendel/spark
      - https://medium.com/@lusardichristian/java-microservices-the-right-way-8f9d9ea2715a
  
- nodejs
  - jre and nodejs
    - https://stackoverflow.com/questions/5062614/how-to-decide-when-to-use-node-js
  - 10 Things I Regret About Node.js - Ryan Dahl 
    - https://youtu.be/M3BM9TB-8yA
  - https://github.com/denoland/deno


- graal native images
  - notes
    - at this point are a concept
    - 12gb of memory and 3-5min compilation is not practical
  - https://github.com/oracle/graal/blob/master/substratevm/LIMITATIONS.md
    - https://www.innoq.com/en/blog/native-clojure-and-graalvm/
  - transcript on graal's JiT vs AoT
    - https://www.infoq.com/presentations/graalvm-performance/
  - https://codurance.es/2018/12/28/native-microservices-with-sparkjava-and-graal/

- jvm and docker
  - http://blog.gilliard.lol/2019/12/04/Clojure-Containers.html
    - https://adoptopenjdk.net/
      - vhttps://stackoverflow.com/questions/52431764/difference-between-openjdk-and-adoptopenjdk
    - https://github.com/orb/lein-metajar
  - https://medium.com/@jean_sossmeier/spring-boot-jvm-1eea422be930
    - https://www.eclipse.org/openj9/
      - https://github.com/eclipse/openj9
    - https://github.com/fabric8io-images/run-java-sh
      - https://github.com/fabric8io-images/run-java-sh/blob/master/TUNING.md
      - https://github.com/fabric8io-images/run-java-sh/blob/master/fish-pepper/run-java-sh/fp-files/run-java.sh

- dockerfile
  - env var into entrypoint
    - https://stackoverflow.com/questions/37904682/how-do-i-use-docker-environment-variable-in-entrypoint-array


- kubernetes
  - https://kubernetes.io/docs/concepts/
    - https://kubernetes.io/docs/concepts/overview/what-is-kubernetes/
  - https://kubernetes.io/docs/concepts/architecture/nodes/#management
    - "The kubelet on a node self-registers to the control plane"
  - https://kubernetes.io/docs/concepts/architecture/control-plane-node-communication/#node-to-control-plane
    - " the default operating mode for connections from the nodes and pods running on the nodes to the control plane is secured by default and can run over untrusted and/or public networks"
  - https://kubernetes.io/blog/2016/10/globally-distributed-services-kubernetes-cluster-federation/
  - kind (to run k8s in docker)
    - https://github.com/kubernetes-sigs/kind
    - https://kind.sigs.k8s.io/docs/user/quick-start/
  - installing production k8s
    - https://kubernetes.io/docs/setup/production-environment/tools/kubeadm/high-availability/
  - self-hosted
    - https://github.com/kubernetes-sigs/bootkube
    - https://github.com/kubernetes/community/blob/master/contributors/design-proposals/cluster-lifecycle/self-hosted-kubernetes.md
  - microK8s
    - https://github.com/ubuntu/microk8s
    - https://microk8s.io/docs/clustering
  - examples
    - https://github.com/kubernetes/examples
  - gitkube
    - https://github.com/hasura/gitkube
  - agones
    - https://github.com/googleforgames/agones
    - https://agones.dev/site/docs/overview/
  - reconfiguring kubelet dynamically
    - https://kubernetes.io/docs/tasks/administer-cluster/reconfigure-kubelet/#reconfiguring-the-kubelet-on-a-running-node-in-your-cluster

- swarm
  - https://docs.docker.com/engine/swarm/
  - https://docs.docker.com/engine/swarm/stack-deploy/
  - docker in docker
    - https://callistaenterprise.se/blogg/teknik/2017/12/18/docker-in-swarm-mode-on-docker-in-docker/
  - https://docs.docker.com/engine/swarm/how-swarm-mode-works/nodes/  
  - routing mesh
    - https://docs.docker.com/engine/swarm/ingress/

- cloud standards
  - https://en.wikipedia.org/wiki/Open_Container_Initiative
    - https://opencontainers.org/

- containerd
  - https://www.docker.com/blog/what-is-containerd-runtime/

- autoscaling
  - k8s
    - https://kubernetes.io/blog/2016/07/autoscaling-in-kubernetes/
    - https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler
  - swarm
    - https://stackoverflow.com/questions/41668621/how-to-configure-autoscaling-on-docker-swarm
    - https://forums.docker.com/t/autoscaling-in-docker-swarm/44353/2

- service mesh
  - https://github.com/linkerd/linkerd
  - https://github.com/linkerd/linkerd2
    - https://servicemesh.io/
    - https://linkerd.io/2/overview/
  - https://github.com/istio/istio

- docker engine api
  - https://docs.docker.com/engine/api/
  - https://docs.docker.com/engine/api/v1.40/
  - https://docs.docker.com/engine/api/sdk/examples/

- nats
  - https://siliconangle.com/2020/01/13/nats-messaging-could-beat-kubernetes-to-the-edge-kubecon-startupoftheweek/
  - https://github.com/nats-io
  - https://docs.nats.io/whats_new_20

- edge computing
  - https://en.wikipedia.org/wiki/Edge_computing
  - https://github.com/kubeedge/kubeedge

- docker in docker
  - https://hub.docker.com/_/docker
    - https://jpetazzo.github.io/2015/09/03/do-not-use-docker-in-docker-for-ci/
    - rootles
      - https://docs.docker.com/engine/security/rootless/
    - where to store data 
      - data can be persisted using -v /my/own/var-lib-docker:/var/lib/docker

- snaps
  - https://snapcraft.io/