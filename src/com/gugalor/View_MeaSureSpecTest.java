package com.gugalor;

/**
 * Created by Administrator on 2015/6/29.
 */
import android.test.AndroidTestCase;
import android.view.View;
import android.view.View.MeasureSpec;

/**
 * Test {@link MeasureSpec}.
 */
public class View_MeaSureSpecTest extends AndroidTestCase {
    private static final int MEASURE_SPEC_SIZE = 1;

    private int mUnspecifiedMeasureSpec;
    private int mExactlyMeasureSpec;
    private int mAtMostMeasureSpec;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mUnspecifiedMeasureSpec = View.MeasureSpec.makeMeasureSpec(MEASURE_SPEC_SIZE,
                View.MeasureSpec.UNSPECIFIED);
        mExactlyMeasureSpec = View.MeasureSpec.makeMeasureSpec(MEASURE_SPEC_SIZE,
                View.MeasureSpec.EXACTLY);
        mAtMostMeasureSpec = View.MeasureSpec.makeMeasureSpec(MEASURE_SPEC_SIZE,
                View.MeasureSpec.AT_MOST);
    }

    public void testConstructor() {
    }

    public void testGetSize() {
        assertEquals(MEASURE_SPEC_SIZE,
                View.MeasureSpec.getSize(mUnspecifiedMeasureSpec));
        assertEquals(MEASURE_SPEC_SIZE,
                View.MeasureSpec.getSize(mExactlyMeasureSpec));
        assertEquals(MEASURE_SPEC_SIZE,
                View.MeasureSpec.getSize(mAtMostMeasureSpec));
    }

    public void testToString() {
        assertEquals("MeasureSpec: UNSPECIFIED " + MEASURE_SPEC_SIZE,
                View.MeasureSpec.toString(mUnspecifiedMeasureSpec));
        assertEquals("MeasureSpec: EXACTLY " + MEASURE_SPEC_SIZE,
                View.MeasureSpec.toString(mExactlyMeasureSpec));
        assertEquals("MeasureSpec: AT_MOST " + MEASURE_SPEC_SIZE,
                View.MeasureSpec.toString(mAtMostMeasureSpec));
    }

    public void testGetMode() {
        assertEquals(View.MeasureSpec.UNSPECIFIED,
                View.MeasureSpec.getMode(mUnspecifiedMeasureSpec));
        assertEquals(View.MeasureSpec.EXACTLY,
                View.MeasureSpec.getMode(mExactlyMeasureSpec));
        assertEquals(View.MeasureSpec.AT_MOST,
                View.MeasureSpec.getMode(mAtMostMeasureSpec));
    }

    public void testMakeMeasureSpec() {
        assertEquals(MEASURE_SPEC_SIZE + View.MeasureSpec.UNSPECIFIED,
                mUnspecifiedMeasureSpec);
        assertEquals(MEASURE_SPEC_SIZE + View.MeasureSpec.EXACTLY,
                mExactlyMeasureSpec);
        assertEquals(MEASURE_SPEC_SIZE + View.MeasureSpec.AT_MOST,
                mAtMostMeasureSpec);
    }
}