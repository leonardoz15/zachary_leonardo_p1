/**
 * 
 */
package TRMS.services;

import java.util.List;

import TRMS.models.ReimbursementRequest;
import TRMS.models.ReimbursementRequest.EventType;

/**
 * @author Zachary Leonardo
 *
 */
public interface ReimbursementRequestService {

	public void createRequest(ReimbursementRequest request);
	
	public ReimbursementRequest readRequest(int requestId);
	
	public List<ReimbursementRequest> readAllRequests();
	
	public ReimbursementRequest updateRequest(int requestId, ReimbursementRequest request);
	
	public void deleteRequest(ReimbursementRequest request);
	
	public double calculateProjected(double cost, EventType eventType);
}
