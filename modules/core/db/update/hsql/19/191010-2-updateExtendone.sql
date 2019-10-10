alter table testextendsenties_ExtendOne add column DELETED_BY varchar(50) ;
alter table testextendsenties_ExtendOne add column UPDATE_TS timestamp ;
alter table testextendsenties_ExtendOne add column PAR1 varchar(255) ;
alter table testextendsenties_ExtendOne add column DELETE_TS timestamp ;
alter table testextendsenties_ExtendOne add column UPDATED_BY varchar(50) ;
alter table testextendsenties_ExtendOne add column PAR2 varchar(255) ;
alter table testextendsenties_ExtendOne add column PAR3 varchar(255) ;
alter table testextendsenties_ExtendOne add column CREATED_BY varchar(50) ;
alter table testextendsenties_ExtendOne add column ID varchar(36) not null ^
update testextendsenties_ExtendOne set ID = '00000000-0000-0000-0000-000000000000' where ID is null ;
alter table testextendsenties_ExtendOne alter column ID set not null ;
alter table testextendsenties_ExtendOne add column CREATE_TS timestamp ;
alter table testextendsenties_ExtendOne add column VERSION integer ^
update testextendsenties_ExtendOne set VERSION = 0 where VERSION is null ;
alter table testextendsenties_ExtendOne alter column VERSION set not null ;
