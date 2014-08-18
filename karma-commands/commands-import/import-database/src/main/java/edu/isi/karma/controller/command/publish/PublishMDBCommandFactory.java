/*******************************************************************************
 * Copyright 2012 University of Southern California
 * 
 ******************************************************************************/
package edu.isi.karma.controller.command.publish;

import javax.servlet.http.HttpServletRequest;

import edu.isi.karma.controller.command.Command;
import edu.isi.karma.controller.command.CommandFactory;
import edu.isi.karma.rep.Workspace;

public class PublishMDBCommandFactory extends CommandFactory {
	private enum Arguments {
		worksheetId
	}

	@Override
	public Command createCommand(HttpServletRequest request,
			Workspace workspace) {
		String worksheetId = request.getParameter(Arguments.worksheetId
				.name());
		return new PublishMDBCommand(getNewId(workspace), worksheetId);
	}

	@Override
	public Class<? extends Command> getCorrespondingCommand()
	{
		return PublishMDBCommand.class;
	}
}
