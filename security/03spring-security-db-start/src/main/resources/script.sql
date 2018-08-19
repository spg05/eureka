 
   
    CREATE TABLE `authorities` (            
               `username` varchar(50) DEFAULT NULL,  
               `authority` varchar(50) DEFAULT NULL  
             );
             

CREATE TABLE `users` (                  
          `username` varchar(50) NOT NULL,      
          `password` varchar(50) DEFAULT NULL,  
          `enabled` tinyint(1) DEFAULT NULL,    
          PRIMARY KEY (`username`)              
        );
        
   
             
CREATE TABLE `groups` (                                  
          `id` int(11) NOT NULL AUTO_INCREMENT,                  
          `group_name` varchar(50) NOT NULL,                     
          PRIMARY KEY (`id`)                                     
        );

CREATE TABLE `group_members` (                           
                 `id` int(11) NOT NULL AUTO_INCREMENT,                  
                 `username` varchar(50) NOT NULL,                       
                 `group_id` int(11) NOT NULL,                           
                 PRIMARY KEY (`id`)                                     
               );


CREATE TABLE `group_authorities` (      
                     `group_id` int(11) NOT NULL,          
                     `authority` varchar(50) NOT NULL      
                   );
                   
                   

insert into groups(group_name) values ('Users');
insert into groups(group_name) values ('Administrators');

insert into group_authorities(group_id, authority)
select id,'ROLE_USER' from groups where group_name='Users';

insert into group_authorities(group_id, authority)
select id,'ROLE_USER' from groups where group_name='Administrators';

insert into group_authorities(group_id, authority)
select id,'ROLE_ADMIN' from groups where group_name='Administrators';

insert into group_members(group_id, username)
select id,'user1@example.com' from groups where group_name='Users';


insert into group_members(group_id, username)
select id,'admin1@example.com' from groups where group_name='Administrators';

