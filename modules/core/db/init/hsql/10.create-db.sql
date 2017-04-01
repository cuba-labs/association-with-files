-- begin SAMPLE_FOO
create table SAMPLE_FOO (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end SAMPLE_FOO
-- begin SAMPLE_FOO_FILE_DESCRIPTOR_LINK
create table SAMPLE_FOO_FILE_DESCRIPTOR_LINK (
    FOO_ID varchar(36) not null,
    FILE_DESCRIPTOR_ID varchar(36) not null,
    primary key (FOO_ID, FILE_DESCRIPTOR_ID)
)^
-- end SAMPLE_FOO_FILE_DESCRIPTOR_LINK
