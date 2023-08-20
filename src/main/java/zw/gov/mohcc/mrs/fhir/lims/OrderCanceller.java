package zw.gov.mohcc.mrs.fhir.lims;

import java.util.Collections;
import org.hl7.fhir.r4.model.Task;

public class OrderCanceller {
    
    private OrderCanceller(){
        
    }
    
    public static void cancelOrder(Task task){
        
        task.setStatus(Task.TaskStatus.CANCELLED);
        
        //You may provide statusReason to indicate why this order is being cancelled. See OrderRejecter as an example
        
        //Save this Task/Order in the Shared Health Record (SHR):: OpenHIE
        FhirResourcesSaver.saveFhirResources(Collections.singletonList(task));
        
    }
    
}
