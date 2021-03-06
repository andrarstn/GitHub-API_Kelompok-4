package com.kelompokempat.githubapi.model.search;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import org.jetbrains.annotations.NotNull;

public class ModelSearchData implements Parcelable{

    @SerializedName("login")
    private String login;

    @SerializedName("url")
    private String url;

    @SerializedName("avatar_url")
    private String avatarUrl;

    @SerializedName("html_url")
    private String htmlUrl;

    public String getLogin() {
        return login;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    protected ModelSearchData(@NotNull Parcel in) {
        this.avatarUrl = in.readString();
        this.login = in.readString();
        this.url = in.readString();
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeString(this.avatarUrl);
        parcel.writeString(this.login);
        parcel.writeString(this.url);
    }

    public static final Creator<ModelSearchData> CREATOR = new Creator<ModelSearchData>() {
        @Override
        public ModelSearchData createFromParcel(Parcel in) {
            return new ModelSearchData(in);
        }

        @Override
        public ModelSearchData[] newArray(int size) {
            return new ModelSearchData[size];
        }
    };

}