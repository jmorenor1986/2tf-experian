#!/usr/bin/env python3
import fileinput
import sys


with fileinput.FileInput(sys.argv[1], inplace=True, backup='.bak') as file:
    for line in file:
        print(line.replace('5000',''+sys.argv[2]), end='')