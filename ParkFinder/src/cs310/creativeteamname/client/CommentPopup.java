package cs310.creativeteamname.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;

public class CommentPopup extends DialogBox {

	public CommentPopup() {
		HorizontalPanel buttonPane = new HorizontalPanel();
        buttonPane.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);

        
		this.center();
		Button ok = new Button("YES");
		this.setText("Upload this comment to facebook?");
		ok.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				//Window.open("https://www.facebook.com/dialog/oauth?client_id=1416292605327006&redirect_uri=http%3A%2F%2F1-dot-yvrparks.appspot.com%2Fparkfinder%2Ffacebook%3Fcomment%3D" + newComment, "_blank", "");
				Window.open("https://www.facebook.com/dialog/oauth?client_id=1416292605327006&scope=publish_actions&redirect_uri=http%3A%2F%2F1-dot-yvrparks.appspot.com%2Fparkfinder%2Ffacebook", "_blank", "");
				CommentPopup.this.hide();
			}
		});
		Button no = new Button("NO");
		no.addClickHandler(new ClickHandler(){
			@Override
			public void onClick(ClickEvent event) {
				CommentPopup.this.hide();
			}
		});
		//this.add(ok);
		//this.add(no);
		buttonPane.add(ok);
        buttonPane.add(no);
        setWidget(buttonPane);
		//setWidget(ok);
	}
}
