// Generated by view binder compiler. Do not edit!
package com.tennine.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.tennine.app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityReelsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatImageView ivBack;

  @NonNull
  public final AppCompatImageView ivReelsPost;

  @NonNull
  public final TextView textView16;

  @NonNull
  public final ViewPager2 vpReels;

  private ActivityReelsBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatImageView ivBack, @NonNull AppCompatImageView ivReelsPost,
      @NonNull TextView textView16, @NonNull ViewPager2 vpReels) {
    this.rootView = rootView;
    this.ivBack = ivBack;
    this.ivReelsPost = ivReelsPost;
    this.textView16 = textView16;
    this.vpReels = vpReels;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityReelsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityReelsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_reels, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityReelsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivBack;
      AppCompatImageView ivBack = ViewBindings.findChildViewById(rootView, id);
      if (ivBack == null) {
        break missingId;
      }

      id = R.id.ivReelsPost;
      AppCompatImageView ivReelsPost = ViewBindings.findChildViewById(rootView, id);
      if (ivReelsPost == null) {
        break missingId;
      }

      id = R.id.textView16;
      TextView textView16 = ViewBindings.findChildViewById(rootView, id);
      if (textView16 == null) {
        break missingId;
      }

      id = R.id.vpReels;
      ViewPager2 vpReels = ViewBindings.findChildViewById(rootView, id);
      if (vpReels == null) {
        break missingId;
      }

      return new ActivityReelsBinding((ConstraintLayout) rootView, ivBack, ivReelsPost, textView16,
          vpReels);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
