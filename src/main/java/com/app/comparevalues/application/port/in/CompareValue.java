package com.app.comparevalues.application.port.in;

import com.app.comparevalues.adapter.in.model.InputRequest;
import com.app.comparevalues.adapter.out.model.view.OutPutResponseVM;

public interface CompareValue {
	OutPutResponseVM compareValue(InputRequest inputRequest);
}
