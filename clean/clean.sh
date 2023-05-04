echo "Limpando Cache do Sistema"
sudo bleachbit -c system.cache
clear
echo "Limpando a Swap e liberando Memória"
sudo bleachbit -c system.memory
clear

sudo apt-get autoclean
sudo apt-get autoremove
sudo apt-get clean

echo "Exibindo o consumo da mamória RAM"
free -h
