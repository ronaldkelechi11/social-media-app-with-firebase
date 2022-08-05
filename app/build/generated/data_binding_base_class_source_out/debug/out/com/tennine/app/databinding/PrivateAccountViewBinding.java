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
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.siyamed.shapeimageview.RoundedImageView;
import com.tennine.app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PrivateAccountViewBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnEditProfile;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final CardView cvFollowers;

  @NonNull
  public final ImageView imageView29;

  @NonNull
  public final RoundedImageView ivPost;

  @NonNull
  public final TextView textView68;

  @NonNull
  public final TextView textView70;

  @NonNull
  public final TextView textView73;

  @NonNull
  public final TextView textView74;

  @NonNull
  public final TextView textView75;

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

  private PrivateAccountViewBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnEditProfile, @NonNull CardView cardView, @NonNull CardView cvFollowers,
      @NonNull ImageView imageView29, @NonNull RoundedImageView ivPost,
      @NonNull TextView textView68, @NonNull TextView textView70, @NonNull TextView textView73,
      @NonNull TextView textView74, @NonNull TextView textView75, @NonNull TextView tvFollowers,
      @NonNull TextView tvFollowing, @NonNull TextView tvFullName, @NonNull TextView tvNickName,
      @NonNull TextView tvPost, @NonNull TextView tvUserName, @NonNull TextView tvbio,
      @NonNull TextView tvlocation) {
    this.rootView = rootView;
    this.btnEditProfile = btnEditProfile;
    this.cardView = cardView;
    this.cvFollowers = cvFollowers;
    this.imageView29 = imageView29;
    this.ivPost = ivPost;
    this.textView68 = textView68;
    this.textView70 = textView70;
    this.textView73 = textView73;
    this.textView74 = textView74;
    this.textView75 = textView75;
    this.tvFollowers = tvFollowers;
    this.tvFollowing = tvFollowing;
    this.tvFullName = tvFullName;
    this.tvNickName = tvNickName;
    this.tvPost = tvPost;
    this.tvUserName = tvUserName;
    this.tvbio = tvbio;
    this.tvlocation = tvlocation;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PrivateAccountViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PrivateAccountViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.private_account_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PrivateAccountViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_editProfile;
      Button btnEditProfile = ViewBindings.findChildViewById(rootView, id);
      if (btnEditProfile == null) {
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

      id = R.id.imageView29;
      ImageView imageView29 = ViewBindings.findChildViewById(rootView, id);
      if (imageView29 == null) {
        break missingId;
      }

      id = R.id.iv_post;
      RoundedImageView ivPost = ViewBindings.findChildViewById(rootView, id);
      if (ivPost == null) {
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

      id = R.id.textView74;
      TextView textView74 = ViewBindings.findChildViewById(rootView, id);
      if (textView74 == null) {
        break missingId;
      }

      id = R.id.textView75;
      TextView textView75 = ViewBindings.findChildViewById(rootView, id);
      if (textView75 == null) {
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

      return new PrivateAccountViewBinding((ConstraintLayout) rootView, btnEditProfile, cardView,
          cvFollowers, imageView29, ivPost, textView68, textView70, textView73, textView74,
          textView75, tvFollowers, tvFollowing, tvFullName, tvNickName, tvPost, tvUserName, tvbio,
          tvlocation);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
