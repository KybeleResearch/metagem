package kybele.metagem.ui.launchs.hybrid2rubytl;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class HYBRID2RubyTLLaunchConfigurationTabGroup extends
		AbstractLaunchConfigurationTabGroup {

	

	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
				new HYBRID2RubyTLLaunchConfigurationTab(),
				new CommonTab()
		};
		setTabs(tabs);		
	}

}
