package FakturaProjekt.client.application.home;

import javax.inject.Inject;

import FakturaProjekt.client.application.ApplicationPresenter;
import FakturaProjekt.client.place.NameTokens;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

public class HomePagePresenter extends Presenter<HomePagePresenter.MyView, HomePagePresenter.MyProxy> {
    public interface MyView extends View {
    }

    @ProxyStandard
    @NameToken(NameTokens.home)
    public interface MyProxy extends ProxyPlace<HomePagePresenter> {
    }

    @Inject
    HomePagePresenter(EventBus eventBus,
                      MyView view,
                      MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_SetMainContent);
    }
}
