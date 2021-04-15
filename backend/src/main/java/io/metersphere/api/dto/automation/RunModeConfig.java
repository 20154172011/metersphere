package io.metersphere.api.dto.automation;

import lombok.Data;

@Data
public class RunModeConfig {
    private String mode;
    private String reportType;
    private String reportName;
    private boolean onSampleError;
}
