-- begin TESTEXTENDSENTIES_ENTITY_WITH_PAR
alter table TESTEXTENDSENTIES_ENTITY_WITH_PAR add constraint FK_TESTEXTENDSENTIES_ENTITY_WITH_PAR_ON_EXTEND_ONE_REF foreign key (EXTEND_ONE_REF) references testextendsenties_ExtendOne(ID)^
alter table TESTEXTENDSENTIES_ENTITY_WITH_PAR add constraint FK_TESTEXTENDSENTIES_ENTITY_WITH_PAR_ON_EXTEND_TWO_REF foreign key (EXTEND_TWO_REF) references testextendsenties_ExtendTwo(ID)^
-- end TESTEXTENDSENTIES_ENTITY_WITH_PAR