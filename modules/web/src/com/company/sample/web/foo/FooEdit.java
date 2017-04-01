package com.company.sample.web.foo;

import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.sample.entity.Foo;
import com.haulmont.cuba.gui.components.actions.CreateAction;
import com.haulmont.cuba.gui.data.CollectionDatasource;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.UUID;

public class FooEdit extends AbstractEditor<Foo> {

    @Named("filesTable.create")
    private CreateAction filesTableCreate;

    @Inject
    private CollectionDatasource<FileDescriptor, UUID> filesDs;

    @Override
    protected void postInit() {
        filesTableCreate.setAfterCommitHandler(entity -> {
            filesDs.modifyItem((FileDescriptor) entity);
        });
    }
}