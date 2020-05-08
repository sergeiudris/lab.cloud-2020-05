- namespaces
  - proc.protocol : specifies a set of functions to interact with the process
  - proc.impl : contains all logic and implements protocols
  - proc.api : does not import impl, only protocols, and creates a futncional api (by proxing proc protocol)
  - api.http: http layer that only import api; proc refernce is dynamically set by app.main
  - app : imports and starts proc.impl (the essence of app) and http layer