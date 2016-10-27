
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name = "userData")
@SessionScoped
public class userData {

    private String locale;

    private static Map<String, Object> localization;

    public userData() {
        localization = new LinkedHashMap<String, Object>();
        localization.put("French", Locale.FRENCH);
        localization.put("English", Locale.ENGLISH);
    }

    public Map<String, Object> getCountries() {
        return localization;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

 
    public void localeChanged(ValueChangeEvent e) {
        String newLocaleValue = e.getNewValue().toString();
        for (Map.Entry<String, Object> entry : localization.entrySet()) {
            if (entry.getValue().toString().equals(newLocaleValue)) {
                FacesContext.getCurrentInstance()
                        .getViewRoot().setLocale((Locale) entry.getValue());
            }
        }
    }
}
