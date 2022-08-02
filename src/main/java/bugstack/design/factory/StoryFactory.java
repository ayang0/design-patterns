package bugstack.design.factory;

import bugstack.design.factory.story.ICommodity;
import bugstack.design.factory.story.impl.CardCommodityService;
import bugstack.design.factory.story.impl.GoodsCommodityService;

public class StoryFactory {

    ICommodity getCommodityService(Integer type) {
        if (type == 1) {
            return new CardCommodityService();
        } else {
            return new GoodsCommodityService();
        }
    };

}
