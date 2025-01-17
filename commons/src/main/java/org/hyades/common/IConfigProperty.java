package org.hyades.common;

public interface IConfigProperty {
    long getId();

    void setId(long var1);

    String getGroupName();

    void setGroupName(String var1);

    String getPropertyName();

    void setPropertyName(String var1);

    String getPropertyValue();

    void setPropertyValue(String var1);

    PropertyType getPropertyType();

    void setPropertyType(PropertyType var1);

    String getDescription();

    void setDescription(String var1);

    public static enum PropertyType {
        BOOLEAN,
        INTEGER,
        NUMBER,
        STRING,
        ENCRYPTEDSTRING,
        TIMESTAMP,
        URL,
        UUID;

        private PropertyType() {
        }
    }
}
