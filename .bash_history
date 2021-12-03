cd /opt/odoo
ls
sudo rm -rf odoo-venv  source
exit
python3 -m venv odoo-venv
source odoo-venv/bin/activate
pip3 install wheel
pip3 install -r odoo14/requirements.txt
deactivate
exit
ls
cd odoo14-custom-addons/
ls
unzip chef.zip > chef
ls
rm chef
ls
rm chef.zip 
