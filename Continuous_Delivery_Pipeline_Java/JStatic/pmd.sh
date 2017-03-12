#! /bin/bash
rm -rf pmd-bin*
wget https://sourceforge.net/projects/pmd/files/pmd/5.1.0/pmd-bin-5.1.0.zip
unzip -q pmd-bin-5.1.0.zip
cd pmd-bin-5.1.0/bin/
bash run.sh pmd -dir /maven/MediumFX/src/application/ -f text -rulesets java-basic,java-design

