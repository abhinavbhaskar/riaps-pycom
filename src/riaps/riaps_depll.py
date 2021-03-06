#!/usr/bin/python3
'''
Top-level script to start the language processor ('depl') for deployment models
Created on Oct 15, 2016

Arguments:
  model        : Name of model file to be processed
  --verbose    : Turns on printing the resulting JSON file on the console 

@author: riaps
'''
from riaps.lang.depl import main

if __name__ == '__main__':
    main()
    
