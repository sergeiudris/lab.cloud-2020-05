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


- indexing website content, SEO
  - https://vuejsdevelopers.com/2018/04/09/single-page-app-seo/
    - https://webmasters.googleblog.com/2015/10/deprecating-our-ajax-crawling-scheme.html
      - https://webmasters.googleblog.com/2014/05/understanding-web-pages-better.html
      - https://en.wikipedia.org/wiki/Progressive_enhancement
        - ...emphasizes core webpage content first. This strategy then progressively adds more nuanced and technically rigorous layers...
        - https://support.google.com/webmasters/answer/81766?hl=en

- server side rendering vs client side rendering (SSR vs CSR)
  - SSR puts additional load on the server in exhange for
    - faster load time
    - search engines
  - opt for CSR with possibly multiple entry points and html files (code splitting)
    - server stays with minimal load
    - ui app abstraction is desinged as decoupled
    - aim to provide js that is renderable by GoogleBot

- examlpes of sitemap.xml and robots.txt
  - github
    - https://github.com/robots.txt
  - google
    - https://www.google.com/robots.txt
    - https://www.google.com/sitemap.xml
  - twitch
    - https://www.twitch.tv/robots.txt
    - https://www.twitch.tv/sitemap_index.xml.gz

- pre-rendering
  - https://web.dev/prerender-with-react-snap/
  - https://github.com/stereobooster/react-snap
  - https://yogthos.net/posts/2015-11-24-Serverside-Reagent.html
    