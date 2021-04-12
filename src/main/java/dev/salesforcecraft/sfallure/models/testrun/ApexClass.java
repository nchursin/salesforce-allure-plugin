
package dev.salesforcecraft.sfallure.models.testrun;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Data;

@Data
@JsonPOJOBuilder(withPrefix = "")
public class ApexClass {

    private Attributes attributes;
    @JsonProperty("Id")
    private String id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("NamespacePrefix")
    private Object namespacePrefix;

}
