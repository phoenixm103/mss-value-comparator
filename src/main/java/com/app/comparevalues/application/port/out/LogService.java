package com.app.comparevalues.application.port.out;

import com.app.comparevalues.adapter.in.model.InputRequest;
import com.app.comparevalues.adapter.out.model.view.OutPutResponseVM;

public interface LogService {
	
	public void saveInputRequest(InputRequest inputRequest);

	public void saveInput(InputRequest inputRequest);

	public void saveOutput(OutPutResponseVM inputRequestVM);
}
