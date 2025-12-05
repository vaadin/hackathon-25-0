package cf.vaadin.hackaton.views.empty;

import com.vaadin.flow.component.ComponentEffect;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextFieldVariant;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;
import com.vaadin.signals.ValueSignal;
import jakarta.annotation.security.RolesAllowed;
import org.vaadin.lineawesome.LineAwesomeIconUrl;


@PageTitle("Empty")
@Route("")
@Menu(order = 0, icon = LineAwesomeIconUrl.FILE)
@RolesAllowed("USER")
public class EmptyView extends VerticalLayout {

    public EmptyView() {
        setSpacing(false);

        var img = new Image("images/empty-plant.png", "placeholder plant");
        img.setWidth("200px");
        add(img);


        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");


        var signal = new ValueSignal<>(String.class);


        var textField = new TextField("My text field");
        textField.addThemeVariants(TextFieldVariant.LUMO_SMALL);
        textField.addClassNames("bordered");
        textField.addValueChangeListener(changeEvent -> {
            signal.value(changeEvent.getValue());
        });

        var textFieldValue = new Div("empty");
        //textFieldValue.addClassNames("bg-red-300");
        //textFieldValue.getElement().bindText(signal);
        //textFieldValue.getElement().bindProperty("class", signal);
        textFieldValue.getElement().bindProperty("classname", signal);

        add(textField, textFieldValue);
    }

}
