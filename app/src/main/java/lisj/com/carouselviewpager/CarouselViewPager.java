package lisj.com.carouselviewpager;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;

/**
 * 旋转木马效果的ViewPager
 *Created by lishaojie on 2018/4/16.
 */
public class CarouselViewPager extends ViewPager {
    public CarouselViewPager(Context context) {
        super(context);
        setChildrenDrawingOrderEnabled(true);
    }
    public CarouselViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        setChildrenDrawingOrderEnabled(true);
    }
    @Override
    protected int getChildDrawingOrder(int childCount, int i) {
        int currentItem = getCurrentItem();
        if (i >= currentItem) {
            return childCount - 1 - i + currentItem;
        }
        return super.getChildDrawingOrder(childCount, i);
    }
}
