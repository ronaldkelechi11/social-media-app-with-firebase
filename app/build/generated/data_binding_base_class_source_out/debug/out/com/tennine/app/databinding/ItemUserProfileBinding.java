// Generated by view binder compiler. Do not edit!
package com.tennine.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.tennine.app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemUserProfileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnEditProfile;

  @NonNull
  public final ImageView btnPost;

  @NonNull
  public final ImageView btnReels;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final CardView cvFollowers;

  @NonNull
  public final ImageView imageView23;

  @NonNull
  public final ImageView imageView24;

  @NonNull
  public final ImageView imageView25;

  @NonNull
  public final ImageView imageView27;

  @NonNull
  public final CardView ivPost;

  @NonNull
  public final AppCompatImageView ivUserProfile;

  @NonNull
  public final TextView textView68;

  @NonNull
  public final TextView textView70;

  @NonNull
  public final TextView textView73;

  @NonNull
  public final TextView tvFollowers;

  @NonNull
  public final TextView tvFollowing;

  @NonNull
  public final TextView tvFullName;

  @NonNull
  public final TextView tvNickName;

  @NonNull
  public final TextView tvPost;

  @NonNull
  public final TextView tvUserName;

  @NonNull
  public final TextView tvbio;

  @NonNull
  public final TextView tvlocation;

  @NonNull
  public final View view2;

  private ItemUserProfileBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnEditProfile,
      @NonNull ImageView btnPost, @NonNull ImageView btnReels, @NonNull CardView cardView,
      @NonNull CardView cvFollowers, @NonNull ImageView imageView23, @NonNull ImageView imageView24,
      @NonNull ImageView imageView25, @NonNull ImageView imageView27, @NonNull CardView ivPost,
      @NonNull AppCompatImageView ivUserProfile, @NonNull TextView textView68,
      @NonNull TextView textView70, @NonNull TextView textView73, @NonNull TextView tvFollowers,
      @NonNull TextView tvFollowing, @NonNull TextView tvFullName, @NonNull TextView tvNickName,
      @NonNull TextView tvPost, @NonNull TextView tvUserName, @NonNull TextView tvbio,
      @NonNull TextView tvlocation, @NonNull View view2) {
    this.rootView = rootView;
    this.btnEditProfile = btnEditProfile;
    this.btnPost = btnPost;
    this.btnReels = btnReels;
    this.cardView = cardView;
    this.cvFollowers = cvFollowers;
    this.imageView23 = imageView23;
    this.imageView24 = imageView24;
    this.imageView25 = imageView25;
    this.imageView27 = imageView27;
    this.ivPost = ivPost;
    this.ivUserProfile = ivUserProfile;
    this.textView68 = textView68;
    this.textView70 = textView70;
    this.textView73 = textView73;
    this.tvFollowers = tvFollowers;
    this.tvFollowing = tvFollowing;
    this.tvFullName = tvFullName;
    this.tvNickName = tvNickName;
    this.tvPost = tvPost;
    this.tvUserName = tvUserName;
    this.tvbio = tvbio;
    this.tvlocation = tvlocation;
    this.view2 = view2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemUserProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemUserProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_user_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemUserProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_editProfile;
      Button btnEditProfile = ViewBindings.findChildViewById(rootView, id);
      if (btnEditProfile == null) {
        break missingId;
      }

      id = R.id.btnPost;
      ImageView btnPost = ViewBindings.findChildViewById(rootView, id);
      if (btnPost == null) {
        break missingId;
      }

      id = R.id.btnReels;
      ImageView btnReels = ViewBindings.findChildViewById(rootView, id);
      if (btnReels == null) {
        break missingId;
      }

      id = R.id.cardView;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.cvFollowers;
      CardView cvFollowers = ViewBindings.findChildViewById(rootView, id);
      if (cvFollowers == null) {
        break missingId;
      }

      id = R.id.imageView23;
      ImageView imageView23 = ViewBindings.findChildViewById(rootView, id);
      if (imageView23 == null) {
        break missingId;
      }

      id = R.id.imageView24;
      ImageView imageView24 = ViewBindings.findChildViewById(rootView, id);
      if (imageView24 == null) {
        break missingId;
      }

      id = R.id.imageView25;
      ImageView imageView25 = ViewBindings.findChildViewById(rootView, id);
      if (imageView25 == null) {
        break missingId;
      }

      id = R.id.imageView27;
      ImageView imageView27 = ViewBindings.findChildViewById(rootView, id);
      if (imageView27 == null) {
        break missingId;
      }

      id = R.id.iv_post;
      CardView ivPost = ViewBindings.findChildViewById(rootView, id);
      if (ivPost == null) {
        break missingId;
      }

      id = R.id.ivUserProfile;
      AppCompatImageView ivUserProfile = ViewBindings.findChildViewById(rootView, id);
      if (ivUserProfile == null) {
        break missingId;
      }

      id = R.id.textView68;
      TextView textView68 = ViewBindings.findChildViewById(rootView, id);
      if (textView68 == null) {
        break missingId;
      }

      id = R.id.textView70;
      TextView textView70 = ViewBindings.findChildViewById(rootView, id);
      if (textView70 == null) {
        break missingId;
      }

      id = R.id.textView73;
      TextView textView73 = ViewBindings.findChildViewById(rootView, id);
      if (textView73 == null) {
        break missingId;
      }

      id = R.id.tvFollowers;
      TextView tvFollowers = ViewBindings.findChildViewById(rootView, id);
      if (tvFollowers == null) {
        break missingId;
      }

      id = R.id.tvFollowing;
      TextView tvFollowing = ViewBindings.findChildViewById(rootView, id);
      if (tvFollowing == null) {
        break missingId;
      }

      id = R.id.tvFullName;
      TextView tvFullName = ViewBindings.findChildViewById(rootView, id);
      if (tvFullName == null) {
        break missingId;
      }

      id = R.id.tvNickName;
      TextView tvNickName = ViewBindings.findChildViewById(rootView, id);
      if (tvNickName == null) {
        break missingId;
      }

      id = R.id.tvPost;
      TextView tvPost = ViewBindings.findChildViewById(rootView, id);
      if (tvPost == null) {
        break missingId;
      }

      id = R.id.tvUserName;
      TextView tvUserName = ViewBindings.findChildViewById(rootView, id);
      if (tvUserName == null) {
        break missingId;
      }

      id = R.id.tvbio;
      TextView tvbio = ViewBindings.findChildViewById(rootView, id);
      if (tvbio == null) {
        break missingId;
      }

      id = R.id.tvlocation;
      TextView tvlocation = ViewBindings.findChildViewById(rootView, id);
      if (tvlocation == null) {
        break missingId;
      }

      id = R.id.view2;
      View view2 = ViewBindings.findChildViewById(rootView, id);
      if (view2 == null) {
        break missingId;
      }

      return new ItemUserProfileBinding((ConstraintLayout) rootView, btnEditProfile, btnPost,
          btnReels, cardView, cvFollowers, imageView23, imageView24, imageView25, imageView27,
          ivPost, ivUserProfile, textView68, textView70, textView73, tvFollowers, tvFollowing,
          tvFullName, tvNickName, tvPost, tvUserName, tvbio, tvlocation, view2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
