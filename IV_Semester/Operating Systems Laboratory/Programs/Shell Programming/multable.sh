#!/bin/bash

echo -n "Which multiplication table? : "
read n
for x in {1..10}
do
  p=$((x * n))
  echo "$n X $x = $p"
  sleep 1
done

