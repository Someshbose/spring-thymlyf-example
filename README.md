#deploying to heroku through pusing container to heroku container registry.

1. build docker image locally by running below command
```shell
mvn docker:build
```

2. login to heroku and detail step check [here](https://medium.com/travis-on-docker/how-to-run-dockerized-apps-on-heroku-and-its-pretty-great-76e07e610e22).
```shell
heroku login
```

and finally push it.

link- https://intense-temple-07263.herokuapp.com/hello
