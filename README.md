#Dependency: 

##mysql 
###installation
* brew install mysql
* unset TMPDIR
* mysql_install_db --verbose --user='lun' --basedir="$(brew --prefix mysql)" --datadir=/usr/local/var/mysql --tmpdir=/tmp 

###setting up
* mysql.server start
* mysql -u root < db/create_db.sql
* mysql -u tallink_user -p (password: tallink_pass)

##Download/install Liferay Portal 6.1 Community Edition

eclipse plugins:

'Liferay IDE' - to add runtime target

Vaadin plugin - as portlet

#Info
http://www.liferay.com/en/community/wiki/-/wiki/Main/Developing+Vaadin+Applications+as+Liferay+Portlets