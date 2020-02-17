package har.task.com.datamodel.harmodel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import har.task.com.datamodel.harmodel.entry.HarLog;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Har {

    private HarLog log;
}