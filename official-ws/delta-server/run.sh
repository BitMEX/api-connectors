#!/bin/bash -e

[ ! -f config.js ] && echo 'Place your config in config.js!' && exit 1;

trap finish EXIT
PID=
function finish() {
  kill $PID
}

node index &
PID=$!

./node_modules/.bin/opn "http://localhost:$(node -e "console.log(require('./config.js').port)")"
wait
