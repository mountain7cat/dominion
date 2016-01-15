package mountaincat.dominion.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Path;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.LinearInterpolator;

public class AnimationUtil {

	private static int CENTER_X_INDEX = 0;
	private static int CENTER_Y_INDEX = 1;

	/**
	 * animation that reveals view in a circular expanding animation
	 *
	 * @param view view to be shown
	 */
	public static void enterReveal( View view ) {
		if ( android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP ) {
			Integer[] centerXcenterYradius = getCenterXcenterY( view );
			int cx = centerXcenterYradius[CENTER_X_INDEX];
			int cy = centerXcenterYradius[CENTER_Y_INDEX];
			int finalRadius = Math.max( view.getWidth(), view.getHeight() ) / 2;

			// create the animator for this view (the start radius is zero)
			Animator anim = ViewAnimationUtils.createCircularReveal( view, cx, cy, 0, finalRadius );

			view.setVisibility( View.VISIBLE );
			anim.start();
		} else {
			view.setVisibility( View.VISIBLE );
		}

	}

	/**
	 * animation that hides view in a circular shrinking animation
	 *
	 * @param view view to be hidden
	 */
	public static void exitReveal( final View view ) {
		if ( android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP ) {
			Integer[] centerXcenterYradius = getCenterXcenterY( view );
			int cx = centerXcenterYradius[CENTER_X_INDEX];
			int cy = centerXcenterYradius[CENTER_Y_INDEX];
			int initRadius = view.getWidth() / 2;

			// create the animation (the final radius is zero)
			Animator anim = ViewAnimationUtils.createCircularReveal( view, cx, cy, initRadius, 0 );

			// make the view invisible when the animation is done
			anim.addListener( new AnimatorListenerAdapter() {
				@Override
				public void onAnimationEnd( Animator animation ) {
					super.onAnimationEnd( animation );
					view.setVisibility( View.INVISIBLE );
				}
			} );

			// start the animation
			anim.start();
		} else {
			view.setVisibility( View.INVISIBLE );
		}
	}

	private static Integer[] getCenterXcenterY( View view ) {
		Integer[] result = new Integer[2];

		// get the center for the clipping circle
		result[CENTER_X_INDEX] = view.getMeasuredWidth() / 2;
		result[CENTER_Y_INDEX] = view.getMeasuredHeight() / 2;
		return result;
	}

	/**
	 * @param view view to be animated
	 * @param duration duration for the animation in millisecond
	 * @param delay delay before animation in millisecond
	 * @param displacement shake displacement in dp
	 */
	public static void shakeViewHorizontally( View view, long duration, long delay, long displacement ) {
		float scale = view.getResources().getDisplayMetrics().density;
		ObjectAnimator anim = ObjectAnimator.ofFloat( view,
				"x",
				view.getLeft(),
				( view.getLeft() - displacement ) * scale,
				( view.getLeft() + displacement ) * scale,
				view.getLeft() );
		anim.setInterpolator( new LinearInterpolator() );
		anim.setDuration( duration );
		anim.setStartDelay( delay );
		anim.start();
	}

	/**
	 * move the view in bezier path from (view.x - dx, view.y-dy) to (view.x, view.y)
	 *
	 * @param view view to be moved
	 * @param dx horizontal displacement
	 * @param dy vertical displacement
	 * @param duration duration of the animation
	 */

	public void moveArc( View view, int dx, int dy, long duration ) {
		if ( android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP ) {
			float scale = view.getResources().getDisplayMetrics().density;
			float scaledX = view.getLeft();
			float scaledY = view.getTop();
			Path path = new Path();
			path.reset();
			path.moveTo( scaledX - ( dx * scale ), scaledY - ( dy * scale ) );
			path.quadTo( scaledX, scaledY - ( dy * scale ), scaledX, scaledY );
			ObjectAnimator anim = ObjectAnimator.ofFloat( view, "x", "y", path );
			anim.setDuration( duration );
			anim.setInterpolator( new LinearInterpolator() );
			anim.start();
		}
	}

	public ActivityOptionsCompat getSceneTransitionAnimationOption( ActivityOptionsCompat options, Activity rootActivity,
			View viewForTransition,
			String transitionName ) {
		options.makeSceneTransitionAnimation( rootActivity, Pair.create( viewForTransition, transitionName ) );
		return options;
	}
}
