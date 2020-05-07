
- running http server on alpine-openjdk11-min (with minified java)
  - alpine container shows in docker images as ~53mb (without uberjar)
  - when running http server, mem usage ~115mb
  - when running with no deps, Thread/sleep , mem usage ~47mb