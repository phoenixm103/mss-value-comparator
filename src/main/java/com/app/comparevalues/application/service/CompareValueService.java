package com.app.comparevalues.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.comparevalues.adapter.in.model.InputRequest;
import com.app.comparevalues.adapter.out.model.view.OutPutResponseVM;
import com.app.comparevalues.adapter.out.mongo.CompareValueRepositoryToPersistInput;
import com.app.comparevalues.adapter.out.mongo.CompareValueRepositoryToPersistOutput;
import com.app.comparevalues.application.port.in.CompareValue;

@Service
public class CompareValueService implements CompareValue {

	@Autowired
	private CompareValueRepositoryToPersistInput compareValueRepositoryToPersistInput;

	@Autowired
	private CompareInputValue compareInputValue;

	@Autowired
	private CompareValueRepositoryToPersistOutput compareValueRepositoryToPersistOutput;
	
	

	public CompareValueService(CompareValueRepositoryToPersistInput compareValueRepositoryToPersistInput,
			CompareInputValue compareInputValue,
			CompareValueRepositoryToPersistOutput compareValueRepositoryToPersistOutput) {
		super();
		this.compareValueRepositoryToPersistInput = compareValueRepositoryToPersistInput;
		this.compareInputValue = compareInputValue;
		this.compareValueRepositoryToPersistOutput = compareValueRepositoryToPersistOutput;
	}
	
	@Override
	public String toString() {
		return "CompareValueService [compareValueRepositoryToPersistInput=" + compareValueRepositoryToPersistInput
				+ ", compareInputValue=" + compareInputValue + ", compareValueRepositoryToPersistOutput="
				+ compareValueRepositoryToPersistOutput + "]";
	}

	public CompareValueService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public OutPutResponseVM compareValue(InputRequest inputRequest) {
		return compareInputValue.compareInputValue(inputRequest);

	}

	public void saveInput(InputRequest inputRequest) {
		compareValueRepositoryToPersistInput.save(inputRequest);

	}

	public void saveOutput(OutPutResponseVM inputRequestVM) {
		compareValueRepositoryToPersistOutput.save(inputRequestVM);

	}

}
