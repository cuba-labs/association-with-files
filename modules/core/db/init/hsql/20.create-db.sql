-- begin SAMPLE_FOO_FILE_DESCRIPTOR_LINK
alter table SAMPLE_FOO_FILE_DESCRIPTOR_LINK add constraint FK_SFFDL_FOO foreign key (FOO_ID) references SAMPLE_FOO(ID)^
alter table SAMPLE_FOO_FILE_DESCRIPTOR_LINK add constraint FK_SFFDL_FILE_DESCRIPTOR foreign key (FILE_DESCRIPTOR_ID) references SYS_FILE(ID)^
-- end SAMPLE_FOO_FILE_DESCRIPTOR_LINK
