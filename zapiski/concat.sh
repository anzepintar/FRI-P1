#! /bin/bash
echo "Output name:"
read output_name
pandoc -s *.md -o $output_name
