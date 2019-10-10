create table testextendsenties_ExtendOne (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    PAR1 varchar(255),
    PAR2 varchar(255),
    --
    PAR3 varchar(255),
    --
    primary key (ID)
);