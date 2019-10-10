-- begin TESTEXTENDSENTIES_EXTENDTWO
create table testextendsenties_ExtendTwo (
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
    par4 varchar(255),
    --
    primary key (ID)
)^
-- end TESTEXTENDSENTIES_EXTENDTWO
-- begin TESTEXTENDSENTIES_EXTENDONE
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
)^
-- end TESTEXTENDSENTIES_EXTENDONE
-- begin TESTEXTENDSENTIES_ENTITY_WITH_PAR
create table TESTEXTENDSENTIES_ENTITY_WITH_PAR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    EXTEND_ONE_REF varchar(36),
    EXTEND_TWO_REF varchar(36),
    --
    primary key (ID)
)^
-- end TESTEXTENDSENTIES_ENTITY_WITH_PAR
