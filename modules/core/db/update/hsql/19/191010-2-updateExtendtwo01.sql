alter table testextendsenties_ExtendTwo add column DELETED_BY varchar(50) ;
alter table testextendsenties_ExtendTwo add column PAR4 varchar(255) ;
alter table testextendsenties_ExtendTwo add column UPDATE_TS timestamp ;
alter table testextendsenties_ExtendTwo add column PAR1 varchar(255) ;
alter table testextendsenties_ExtendTwo add column DELETE_TS timestamp ;
alter table testextendsenties_ExtendTwo add column UPDATED_BY varchar(50) ;
alter table testextendsenties_ExtendTwo add column PAR2 varchar(255) ;
alter table testextendsenties_ExtendTwo add column CREATED_BY varchar(50) ;
alter table testextendsenties_ExtendTwo add column ID varchar(36) not null ^
update testextendsenties_ExtendTwo set ID = '00000000-0000-0000-0000-000000000000' where ID is null ;
alter table testextendsenties_ExtendTwo alter column ID set not null ;
alter table testextendsenties_ExtendTwo add column CREATE_TS timestamp ;
alter table testextendsenties_ExtendTwo add column VERSION integer ^
update testextendsenties_ExtendTwo set VERSION = 0 where VERSION is null ;
alter table testextendsenties_ExtendTwo alter column VERSION set not null ;
