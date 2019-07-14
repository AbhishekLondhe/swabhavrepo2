package com.techlabs.solution.test;

import com.techlabs.solution.State;
import com.techlabs.solution.TVContext;
import com.techlabs.solution.TvMuteState;
import com.techlabs.solution.TvStartState;
import com.techlabs.solution.TvStopState;

public class TestTvSolution {

	public static void main(String args[]) {
		TVContext tc=new TVContext();
		State startState =new TvStartState();
		State stopState=new TvStopState();
		State muteState=new TvMuteState();
		
		tc.setState(startState);
		tc.doAction();
		tc.setState(stopState);
		tc.doAction();
		tc.setState(muteState);
		tc.doAction();
	}
}
