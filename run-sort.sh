#! /usr/bin/env bash

DIR="out"

# Clean --- empty the out directory if exists, create an empty directory otherwise
if [ -d $DIR ]
then
  if [ "$(ls -A $DIR)" ]; then
    rm -rf $DIR/*
  fi
else
  mkdir $DIR
fi

# Compile
javac -cp "lib/*" -d out src/sort/*

# Run mutation testing (sort only)
java -cp "lib/*" org.pitest.mutationtest.commandline.MutationCoverageReport \
  --reportDir reports \
  --classPath "lib/junit-*,out" \
  --targetClasses "sort.Sort" \
  --targetTests "sort.SortTest" \
  --sourceDirs "src" \
  --mutators "STRONGER"

