package com.company.sample.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.FileDescriptor;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "SAMPLE_FOO")
@Entity(name = "sample$Foo")
public class Foo extends StandardEntity {
    private static final long serialVersionUID = -6122883978231372610L;

    @Column(name = "NAME")
    protected String name;

    @JoinTable(name = "SAMPLE_FOO_FILE_DESCRIPTOR_LINK",
        joinColumns = @JoinColumn(name = "FOO_ID"),
        inverseJoinColumns = @JoinColumn(name = "FILE_DESCRIPTOR_ID"))
    @ManyToMany
    protected List<FileDescriptor> files;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFiles(List<FileDescriptor> files) {
        this.files = files;
    }

    public List<FileDescriptor> getFiles() {
        return files;
    }


}