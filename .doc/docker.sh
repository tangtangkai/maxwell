# 启动mariadb数据库
docker run -d -e MARIADB_ROOT_PASSWORD="123456" -p 3306:3306 mariadb;
# 更新apt 以便于安装vim等工具
apt-get update