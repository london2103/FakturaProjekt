package FakturaProjekt.client.application;

import FakturaProjekt.client.application.home.HomeModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import FakturaProjekt.client.application.wystawianiefaktur.WystawianieFakturModule;
import FakturaProjekt.client.application.pozycjafaktury.PozycjaFakturyModule;

public class ApplicationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
		install(new PozycjaFakturyModule());
		install(new WystawianieFakturModule());
		install(new HomeModule());

        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
                ApplicationPresenter.MyProxy.class);
    }
}
