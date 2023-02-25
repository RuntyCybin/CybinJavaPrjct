INSERT INTO userroles (roleid, rolename) VALUES (1, 'admin');
INSERT INTO userroles (roleid, rolename) VALUES (2, 'user');
INSERT INTO users (usersid, usersname, roleid) VALUES (1, 'admins', 1);
INSERT INTO users (usersid, usersname, roleid) VALUES (2, 'nico', 2);
INSERT INTO users (usersid, usersname, roleid) VALUES (3, 'jhon', 2);