package com.phones.utils;

import com.phones.gui.fields.*;
import javafx.scene.layout.Pane;

public class FieldGenerator extends Pane {

    public FieldGenerator(Object objectToInspect, FieldOptions field) {
        FieldWrapper newField;
        switch (field.getFieldType()) {
            case TEXT:
                newField = new TextFieldEditor(objectToInspect, field);
                break;
            case BOOLEAN:
                newField = new BooleanFieldEditor(objectToInspect, field);
                break;
            case LIST:
                newField = new SelectFieldEditor(objectToInspect, field);
                break;
            default:
                newField = null;
        }

        if (newField != null) {
            getChildren().add(newField.getControl());
        }
    }
}
