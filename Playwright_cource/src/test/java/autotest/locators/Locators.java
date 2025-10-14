package autotest.locators;


public class Locators {
    public static final String LOGO_SELECTOR = "a.header__logo > img[alt='Логотип интернет магазина Технозавррр']";
    public static final String FOOTER_SELECTOR = "footer";
    public static final String CONTACT_LINK_SELECTOR = "footer a[href='tel:88006009009']";
    public static final String PRIVACY_POLICY_LINK_SELECTOR = "footer a[href='#']";
    public static final String VIEW_ALL_BUTTON_SELECTOR = "button.filter__submit.button.button--primery";
    public static final String PAGINATION_SELECTOR = "ul.catalog__pagination";
    public static final String PAGE_LINK_SELECTOR = PAGINATION_SELECTOR + ">li.pagination__item>a.pagination__link";
    public static final String CART_LINK_SELECTOR = "a.header__cart";
    public static final String CATALOG_ITEMS_LIST = "ul.catalog__list > li.catalog__item";
}
